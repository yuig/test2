package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum mn2 implements a.w {
    STATUS_UNKNOWN(0),
    STATUS_UPDATE_PROGRAM_BYTECODE(1),
    STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE(2),
    STATUS_NO_UPDATE(3),
    STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED(4),
    STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE(5),
    STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR(6),
    STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE(7),
    STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR(8),
    STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE(9),
    STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED(10),
    STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED(11);


    /* renamed from: a, reason: collision with root package name */
    public final int f8314a;

    mn2(int i13) {
        this.f8314a = i13;
    }

    public static mn2 a(int i13) {
        switch (i13) {
            case 0:
                return STATUS_UNKNOWN;
            case 1:
                return STATUS_UPDATE_PROGRAM_BYTECODE;
            case 2:
                return STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE;
            case 3:
                return STATUS_NO_UPDATE;
            case 4:
                return STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED;
            case 5:
                return STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE;
            case 6:
                return STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR;
            case 7:
                return STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE;
            case 8:
                return STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR;
            case 9:
                return STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE;
            case 10:
                return STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED;
            case 11:
                return STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + mn2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8314a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f8314a;
    }
}
