package mn;

import com.google.android.gms.internal.measurement.x;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f87747c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f87748d;

    /* renamed from: e, reason: collision with root package name */
    public final long f87749e;

    public a(x xVar, HashSet hashSet, JSONObject jSONObject, long j13) {
        super(xVar);
        this.f87747c = new HashSet(hashSet);
        this.f87748d = jSONObject;
        this.f87749e = j13;
    }
}
