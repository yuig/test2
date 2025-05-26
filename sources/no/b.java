package no;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f91652b;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f91653a;

    static {
        a aVar = new a();
        aVar.a(1, "controls");
        f91652b = new b(aVar.f91651a);
    }

    public b(JSONObject jSONObject) {
        this.f91653a = jSONObject;
    }

    public final String toString() {
        String jSONObject = this.f91653a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }
}
