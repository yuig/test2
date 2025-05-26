package eh0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f58945a;

    public static boolean a(Context context, rg0.n experienceValue, w eventManager, tb0.h crashReporter, Function0 function0) {
        jf2.c rendering;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        int i13 = 0;
        if (f58945a) {
            return false;
        }
        ag2.e eVar = experienceValue.f108068j;
        if (eVar instanceof l) {
            l lVar = (l) eVar;
            String str = lVar.f15163a;
            String title = str == null ? "" : str;
            String str2 = lVar.f15164b;
            String str3 = str2 == null ? "" : str2;
            a aVar = lVar.f58935d;
            String detail = str3;
            b completeButtonRendering = new b(aVar, new m(experienceValue, aVar, context, crashReporter, 0));
            a aVar2 = lVar.f58936e;
            b bVar = aVar2 != null ? new b(aVar2, new m(experienceValue, aVar2, context, crashReporter, 1)) : null;
            n onCloseButtonClick = new n(experienceValue, function0, i13);
            n onDismiss = new n(experienceValue, function0, 1);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(detail, "detail");
            kg.n media = lVar.f58934c;
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(onCloseButtonClick, "onCloseButtonClick");
            Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
            Intrinsics.checkNotNullParameter(completeButtonRendering, "completeButtonRendering");
            jf2.c cVar = new jf2.c();
            cVar.f75872a = title;
            cVar.f75873b = detail;
            cVar.f75874c = media;
            cVar.f75875d = onCloseButtonClick;
            cVar.f75876e = onDismiss;
            cVar.f75877f = completeButtonRendering;
            cVar.f75878g = bVar;
            rendering = cVar;
        } else {
            rendering = null;
        }
        if (rendering == null) {
            return false;
        }
        i iVar = new i();
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        iVar.f58931f0 = rendering;
        eventManager.d(new of0.a(iVar));
        f58945a = true;
        experienceValue.g();
        return true;
    }
}
