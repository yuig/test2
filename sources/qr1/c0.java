package qr1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lqr1/c0;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "device", "b", "location", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("device")
    private final String device;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("location")
    private final String location;

    /* renamed from: a, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* renamed from: b, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.device, c0Var.device) && Intrinsics.d(this.location, c0Var.location);
    }

    public final int hashCode() {
        String str = this.device;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.a.m("QrCodeVerificationResponse(device=", this.device, ", location=", this.location, ")");
    }
}
