package ads_mobile_sdk;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wi.i;
import wi.s;

/* loaded from: classes2.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public String f12338a;

    /* renamed from: b, reason: collision with root package name */
    public vo f12339b;

    /* renamed from: c, reason: collision with root package name */
    public i f12340c;

    /* renamed from: d, reason: collision with root package name */
    public List f12341d = Collections.synchronizedList(new ArrayList());

    public final void a(r0 r0Var, long j13, s sVar) {
        i iVar = (i) this.f12341d.get(r0Var.f10397w);
        this.f12341d.set(r0Var.f10397w, new i(iVar.f129943a, zn2.b.e(j13), sVar, iVar.f129946d, iVar.f129947e, iVar.f129948f, iVar.f129949g, iVar.f129950h));
    }

    public final wi.b0 a() {
        vo voVar = this.f12339b;
        if (voVar == null) {
            return null;
        }
        i iVar = this.f12340c;
        String str = iVar != null ? iVar.f129943a : null;
        String str2 = this.f12338a;
        Bundle bundle = voVar.f12592q;
        List adapterResponses = this.f12341d;
        Intrinsics.checkNotNullExpressionValue(adapterResponses, "adapterResponses");
        return new wi.b0(str, str2, bundle, adapterResponses);
    }
}
