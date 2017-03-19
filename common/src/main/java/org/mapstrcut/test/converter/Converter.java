package org.mapstrcut.test.converter;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

/**
 * @author Vaclav Stengl
 */
@MapperConfig(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface Converter<S, T>  {

    T convert(S source);
}
