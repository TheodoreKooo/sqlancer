package sqlancer.materialize.ast;

import java.util.Collections;
import java.util.List;

import sqlancer.Randomly;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.ast.SelectBase;
import sqlancer.common.ast.newast.Select;
import sqlancer.materialize.MaterializeSchema;
import sqlancer.materialize.MaterializeSchema.MaterializeDataType;
import sqlancer.materialize.MaterializeSchema.MaterializeTable;
import sqlancer.materialize.MaterializeVisitor;

public class MaterializeSelect extends SelectBase<MaterializeExpression> implements MaterializeExpression,
        Select<MaterializeJoin, MaterializeExpression, MaterializeTable, MaterializeSchema.MaterializeColumn> {

    private List<JoinBase<MaterializeExpression>> joinClauses = Collections.emptyList();
    private MaterializeExpression distinctOnClause;
    private ForClause forClause;

    public enum ForClause {
        UPDATE("UPDATE"), NO_KEY_UPDATE("NO KEY UPDATE"), SHARE("SHARE"), KEY_SHARE("KEY SHARE");

        private final String textRepresentation;

        ForClause(String textRepresentation) {
            this.textRepresentation = textRepresentation;
        }

        public String getTextRepresentation() {
            return textRepresentation;
        }

        public static ForClause getRandom() {
            return Randomly.fromOptions(values());
        }
    }

    public static class MaterializeFromTable implements MaterializeExpression {
        private final MaterializeTable t;
        private final boolean only;

        public MaterializeFromTable(MaterializeTable t, boolean only) {
            this.t = t;
            this.only = only;
        }

        public MaterializeTable getTable() {
            return t;
        }

        public boolean isOnly() {
            return only;
        }

        @Override
        public MaterializeDataType getExpressionType() {
            return null;
        }
    }

    public static class MaterializeSubquery implements MaterializeExpression {
        private final MaterializeSelect s;
        private final String name;

        public MaterializeSubquery(MaterializeSelect s, String name) {
            this.s = s;
            this.name = name;
        }

        public MaterializeSelect getSelect() {
            return s;
        }

        public String getName() {
            return name;
        }

        @Override
        public MaterializeDataType getExpressionType() {
            return null;
        }
    }

    public void setSelectType(SelectType fromOptions) {
        this.setSelectOption(fromOptions);
    }

    public void setDistinctOnClause(MaterializeExpression distinctOnClause) {
        if (selectOption != SelectType.DISTINCT) {
            throw new IllegalArgumentException();
        }
        this.distinctOnClause = distinctOnClause;
    }

    @Override
    public MaterializeDataType getExpressionType() {
        return null;
    }

    @Override
    public void setJoinClauses(List<JoinBase<MaterializeExpression>> joinStatements) {
        this.joinClauses = joinStatements;
    }

    @Override
    public List<JoinBase<MaterializeExpression>> getJoinClauses() {
        return joinClauses;
    }

    @Override
    public MaterializeExpression getDistinctOnClause() {
        return distinctOnClause;
    }

    public void setForClause(ForClause forClause) {
        this.forClause = forClause;
    }

    public ForClause getForClause() {
        return forClause;
    }

    @Override
    public String asString() {
        return MaterializeVisitor.asString(this);
    }

}
