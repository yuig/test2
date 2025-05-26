package si;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes3.dex */
public abstract class b extends bi.a implements c {
    @Override // bi.a
    public final boolean B(int i13, Parcel parcel, Parcel parcel2) {
        switch (i13) {
            case 3:
                bi.b.b(parcel);
                break;
            case 4:
                bi.b.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                bi.b.b(parcel);
                break;
            case 7:
                bi.b.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) bi.b.a(parcel, zak.CREATOR);
                bi.b.b(parcel);
                l0 l0Var = (l0) this;
                l0Var.f30846c.post(new u0(2, l0Var, zakVar));
                break;
            case 9:
                bi.b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
