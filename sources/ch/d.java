package ch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzaz;

/* loaded from: classes3.dex */
public final class d extends i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27716f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f27717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zzav zzavVar) {
        super(1610);
        this.f27717g = zzavVar;
    }

    @Override // ch.g
    public final void c(zh.f fVar) {
        int i13 = this.f27716f;
        AbstractSafeParcelable abstractSafeParcelable = this.f27717g;
        h hVar = this.f27723e;
        switch (i13) {
            case 0:
                zzaz zzazVar = (zzaz) abstractSafeParcelable;
                Parcel B = fVar.B();
                int i14 = zh.h.f141970a;
                if (hVar == null) {
                    B.writeStrongBinder(null);
                } else {
                    B.writeStrongBinder(hVar);
                }
                if (zzazVar == null) {
                    B.writeInt(0);
                } else {
                    B.writeInt(1);
                    zzazVar.writeToParcel(B, 0);
                }
                fVar.C(B, 5);
                break;
            default:
                zzav zzavVar = (zzav) abstractSafeParcelable;
                Parcel B2 = fVar.B();
                int i15 = zh.h.f141970a;
                if (hVar == null) {
                    B2.writeStrongBinder(null);
                } else {
                    B2.writeStrongBinder(hVar);
                }
                if (zzavVar == null) {
                    B2.writeInt(0);
                } else {
                    B2.writeInt(1);
                    zzavVar.writeToParcel(B2, 0);
                }
                fVar.C(B2, 9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zzaz zzazVar) {
        super(1606);
        this.f27717g = zzazVar;
    }
}
