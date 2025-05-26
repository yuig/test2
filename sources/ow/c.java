package ow;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f97761s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p0 p0Var, List list, bl2.c cVar) {
        super(2, cVar);
        this.f97760r = p0Var;
        this.f97761s = list;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f97760r, this.f97761s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        fn.h b13;
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p0 p0Var = this.f97760r;
        uw.b bVar = p0Var.f97860b;
        fn.g partner = p0Var.f97873o;
        if (partner == null) {
            Intrinsics.r("partner");
            throw null;
        }
        String serviceContent = p0Var.f97874p;
        if (serviceContent == null) {
            Intrinsics.r("omidJsServiceContent");
            throw null;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(serviceContent, "serviceContent");
        List verificationConfigs = this.f97761s;
        Intrinsics.checkNotNullParameter(verificationConfigs, "verificationConfigs");
        Intrinsics.checkNotNullParameter("pinterest.com", "contentUrl");
        try {
            List<ww.h> list = verificationConfigs;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            for (ww.h hVar : list) {
                String str2 = hVar.f131175c;
                URL url = hVar.f131173a;
                if (str2 != null && str2.length() != 0 && (str = hVar.f131174b) != null && str.length() != 0) {
                    b13 = fn.h.a(str, url, hVar.f131175c);
                    arrayList.add(b13);
                }
                b13 = fn.h.b(url);
                arrayList.add(b13);
            }
            fn.i b14 = fn.i.b(e2.g0.b(fn.b.NATIVE_DISPLAY, fn.d.BEGIN_TO_RENDER, fn.f.NATIVE, fn.f.NONE), android.support.v4.media.a.e(partner, serviceContent, arrayList));
            return new ww.e(new ww.c(b14, com.iab.omid.library.pinterest.adsession.media.b.e(b14), null));
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}
