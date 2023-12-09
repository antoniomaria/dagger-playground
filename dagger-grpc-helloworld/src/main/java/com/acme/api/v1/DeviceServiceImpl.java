package com.acme.api.v1;

import com.google.protobuf.FieldMask;
import dagger.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;
//import com.acme.api.v1.DeviceServiceGrpc.*;
//import com.acme.api.v1.DeviceServiceGrpc;
import javax.inject.Inject;
import javax.inject.Singleton;

@GrpcService(grpcClass = DeviceServiceGrpc.class)
public class DeviceServiceImpl extends DeviceServiceGrpc.DeviceServiceImplBase {

    @Inject
    public DeviceServiceImpl() {
    }


    public com.acme.api.v1.DevicePb.Device createDevice(String deviceId) {
        return com.acme.api.v1.DevicePb.Device.newBuilder().
                setDeviceId(deviceId).
                setDeviceState("IN_OPERATION").
                setType("METER").
                setDeviceModel("E123").
                setCommTechnology("Cellular")
                .setFirmwareVersion("1.0.0")
                .setHardwareVersion("2.0.0")
                .build();

    }


}
