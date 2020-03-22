package org.csu.mypetstore_smm.persistence;

import org.csu.mypetstore_smm.domain.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    Category getCategory(String categoryId);
}
