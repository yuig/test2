package ch;

import android.os.Parcel;
import com.google.android.gms.internal.auth.zzax;

/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzax f27720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zzax zzaxVar) {
        super(1607);
        this.f27720e = zzaxVar;
    }

    @Override // ch.g
    public final void c(zh.f fVar) {
        e eVar = new e(this, this);
        Parcel B = fVar.B();
        int i13 = zh.h.f141970a;
        B.writeStrongBinder(eVar);
        zzax zzaxVar = this.f27720e;
        if (zzaxVar == null) {
            B.writeInt(0);
        } else {
            B.writeInt(1);
            zzaxVar.writeToParcel(B, 0);
        }
        fVar.C(B, 6);
    }
}
