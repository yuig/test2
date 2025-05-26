package li;

import android.os.Parcel;
import android.os.Parcelable;
import bb.p;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes3.dex */
public abstract class h extends hi.j implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f83535a = 0;

    @Override // hi.j
    public final boolean j(int i13, Parcel parcel) {
        if (i13 == 1) {
            Parcelable.Creator<LocationResult> creator = LocationResult.CREATOR;
            int i14 = hi.k.f69236a;
            p pVar = new p((AbstractSafeParcelable) (parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null), 17);
            l lVar = ((hi.f) this).f69231b;
            lVar.getClass();
            lVar.f30841a.execute(new u0(lVar, pVar));
        } else {
            if (i13 != 2) {
                return false;
            }
            Parcelable.Creator<LocationAvailability> creator2 = LocationAvailability.CREATOR;
            int i15 = hi.k.f69236a;
            p pVar2 = new p((AbstractSafeParcelable) (parcel.readInt() != 0 ? creator2.createFromParcel(parcel) : null), 18);
            l lVar2 = ((hi.f) this).f69231b;
            lVar2.getClass();
            lVar2.f30841a.execute(new u0(lVar2, pVar2));
        }
        return true;
    }
}
