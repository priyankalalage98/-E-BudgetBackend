package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.thymeleaf.expression.Lists;

import Budget.Model.SubCategoryModel;
import antlr.collections.List;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryModel, Integer> {

}
