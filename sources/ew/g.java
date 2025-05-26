package ew;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nb0.x;
import tb0.p;

/* loaded from: classes3.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f60311r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f60311r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f60311r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = this.f60311r;
        Context context = jVar.f60315a;
        Intrinsics.checkNotNullParameter(context, "context");
        ((hw.a) jVar.f60327m).a(hw.b.WEBVIEW_USER_AGENT_FETCHING);
        jVar.f60323i.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String e13 = jVar.e();
                l lVar = jVar.f60324j;
                if (e13 != null) {
                    ((c) lVar).f60289f = e13;
                } else {
                    try {
                        str = WebSettings.getDefaultUserAgent(context);
                    } catch (Exception e14) {
                        jVar.f60329o.q(e14, "User failed to generate UA for GMA SDK", p.ADS_GMA);
                        str = null;
                    }
                    if (str != null) {
                        x xVar = jVar.f60316b;
                        xVar.b("SHARED_PREF_USER_AGENT", str);
                        ((pb0.g) jVar.f60317c).getClass();
                        xVar.c("SHARED_PREF_USER_AGENT_EXPIRY", System.currentTimeMillis() + 1209600000);
                    }
                    ((c) lVar).f60289f = str;
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f80348a;
    }
}
