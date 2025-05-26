package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\"\u0010 \u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\t¨\u0006&"}, d2 = {"Lcom/pinterest/api/model/UploadStatus;", "Ldl1/s;", "Landroid/os/Parcelable;", "", "a", "J", "e", "()J", "u", "(J)V", "id", "", "b", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "v", "(Ljava/lang/String;)V", "signature", "c", "h", "x", "status", "d", "j", "y", "type", "s", "failureCode", "f", "getUploadedTime", "B", "uploadedTime", "Landroid/os/Parcel;", "source", "<init>", "(Landroid/os/Parcel;)V", "com/pinterest/api/model/ly0", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class UploadStatus implements dl1.s, Parcelable {

    /* renamed from: a, reason: from kotlin metadata */
    @om.b("upload_id")
    private long id;

    /* renamed from: b, reason: from kotlin metadata */
    @om.b("signature")
    private String signature;

    /* renamed from: c, reason: from kotlin metadata */
    @om.b("status")
    private String status;

    /* renamed from: d, reason: from kotlin metadata */
    @om.b("type")
    private String type;

    /* renamed from: e, reason: from kotlin metadata */
    @om.b("failure_code")
    private String failureCode;

    /* renamed from: f, reason: from kotlin metadata */
    @om.b("upload_time")
    private long uploadedTime;

    /* renamed from: g */
    public static final ly0 f35584g = new ly0(null);

    /* renamed from: h */
    public static final String f35585h = pc0.REGISTER_TYPE_STORY_PIN_VIDEO.getValue();

    @NotNull
    public static final Parcelable.Creator<UploadStatus> CREATOR = new ky0();

    public UploadStatus() {
        this(null, 1, null);
    }

    public final void B(long j13) {
        this.uploadedTime = j13;
    }

    /* renamed from: a, reason: from getter */
    public final String getFailureCode() {
        return this.failureCode;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return String.valueOf(this.id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.d(UploadStatus.class, obj.getClass()) && this.id == ((UploadStatus) obj).id;
    }

    /* renamed from: g, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* renamed from: h, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final int hashCode() {
        return Long.hashCode(this.id);
    }

    /* renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean k() {
        return Intrinsics.d(this.status, uj0.SUCCEEDED.getValue()) || Intrinsics.d(this.status, uj0.FAILED.getValue());
    }

    public final boolean l() {
        return Intrinsics.d(this.status, uj0.PROCESSING.getValue()) || k();
    }

    public final boolean n() {
        return Intrinsics.d(this.status, uj0.PROCESSING.getValue()) || Intrinsics.d(this.status, uj0.SUCCEEDED.getValue());
    }

    public final boolean q() {
        return Intrinsics.d(this.status, uj0.SUCCEEDED.getValue());
    }

    public final void s(String str) {
        this.failureCode = str;
    }

    public final void u(long j13) {
        this.id = j13;
    }

    public final void v(String str) {
        this.signature = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.signature);
        dest.writeString(this.status);
        dest.writeString(this.type);
        dest.writeString(this.failureCode);
        dest.writeLong(this.uploadedTime);
    }

    public final void x(String str) {
        this.status = str;
    }

    public final void y(String str) {
        this.type = str;
    }

    public UploadStatus(Parcel parcel) {
        if (parcel != null) {
            this.id = parcel.readLong();
            this.signature = parcel.readString();
            this.status = parcel.readString();
            this.type = parcel.readString();
            this.failureCode = parcel.readString();
            this.uploadedTime = parcel.readLong();
        }
    }

    public /* synthetic */ UploadStatus(Parcel parcel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : parcel);
    }
}
