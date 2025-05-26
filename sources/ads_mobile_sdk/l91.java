package ads_mobile_sdk;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l91 implements MediationAdRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7740a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7742c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7743d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7744e;

    /* renamed from: f, reason: collision with root package name */
    public final Location f7745f;

    public /* synthetic */ l91(Set set, boolean z13, int i13, int i14, String str) {
        this(set, z13, i13, i14, str, null);
    }

    public l91(Set set, boolean z13, int i13, int i14, String str, Location location) {
        this.f7740a = set;
        this.f7741b = z13;
        this.f7742c = i13;
        this.f7743d = i14;
        this.f7744e = str;
        this.f7745f = location;
    }
}
