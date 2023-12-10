package com.acme.dagger.grpc;

import com.acme.api.v1.DevicePb;
import com.acme.api.v1.DeviceServiceGrpc;
import com.google.protobuf.FieldMask;
import dagger.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;

import javax.inject.Inject;

@GrpcService(grpcClass = DeviceServiceGrpc.class)
public class DeviceServiceImpl extends DeviceServiceGrpc.DeviceServiceImplBase {

    @Inject
    public DeviceServiceImpl() {
        System.out.println("DeviceServiceImpl init");

    }

    @Override
    public void getDevice(DevicePb.GetDeviceRequest request, StreamObserver<DevicePb.GetDeviceResponse> responseObserver) {

        FieldMask fieldsProjection = request.getFieldProjections();

        System.out.println("getFieldsProjectino" + fieldsProjection);

        System.out.println("Query Device Request received ");

        System.out.println("getTenantCode(): " + request.getTenantCode());

        responseObserver.onNext(com.acme.api.v1.DevicePb.GetDeviceResponse.newBuilder().setDevice(createDevice(request.getId())).build());
        responseObserver.onCompleted();
    }


    public com.acme.api.v1.DevicePb.Device createDevice(String deviceId) {
        return com.acme.api.v1.DevicePb.Device.newBuilder().
                setDeviceId(deviceId).
                setDeviceState("IN_OPERATION").
                setType("METER").
                setDeviceModel("E123").
                setCommTechnology("Cellular")
                .setCommQuality(0.99)
                .setFirmwareVersion("1.0.0")
                .setHardwareVersion("2.0.0")
                .setWarrantyStartTime(com.google.type.Date.newBuilder().setDay(31).setMonth(12).setYear(2022))
                .build();
    }


}
