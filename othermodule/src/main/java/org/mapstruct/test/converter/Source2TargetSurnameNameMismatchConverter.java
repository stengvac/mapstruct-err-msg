package org.mapstruct.test.converter;

import org.mapstrcut.test.converter.Converter;
import org.mapstruct.Mapper;
import org.mapstruct.test.model.Source;
import org.mapstruct.test.model.TargetSurnameNameMismatch;

/**
 * @author Vaclav Stengl
 */
@Mapper(config = Converter.class)
public interface Source2TargetSurnameNameMismatchConverter extends Converter<Source, TargetSurnameNameMismatch> {
}
