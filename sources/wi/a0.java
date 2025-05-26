package wi;

import a.l0;
import ads_mobile_sdk.cm0;
import android.content.Context;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f129925a;

    /* renamed from: b, reason: collision with root package name */
    public final z f129926b;

    /* renamed from: c, reason: collision with root package name */
    public final w f129927c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f129928d;

    /* renamed from: e, reason: collision with root package name */
    public final x f129929e;

    public a0(y yVar, z zVar, w wVar, ArrayList arrayList, x xVar) {
        this.f129925a = yVar;
        this.f129926b = zVar;
        this.f129927c = wVar;
        this.f129928d = arrayList;
        this.f129929e = xVar;
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        l0 l0Var = cm0.f3958f;
        return CollectionsKt.L(this.f129928d, l0.b(context));
    }
}
