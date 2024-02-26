package com.vishnu.restapi.api.v1.mapper;

import com.vishnu.restapi.api.v1.model.VendorDTO;
import com.vishnu.restapi.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Data transfer object mapper using MapStruct
 */
@Mapper
public interface VendorMapper {


    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);
    Vendor vendorDTOToVendor(VendorDTO vendorDTO);
}
