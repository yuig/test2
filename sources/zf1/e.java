package zf1;

import a.g0;
import android.content.Context;
import android.graphics.Typeface;
import com.pinterest.api.model.yl0;
import h32.f1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kk2.k;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import nx.d0;
import okhttp3.OkHttpClient;
import rf1.v;
import uj2.b0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f141925a;

    /* renamed from: b, reason: collision with root package name */
    public h22.f f141926b;

    /* renamed from: c, reason: collision with root package name */
    public ee0.b f141927c;

    /* renamed from: d, reason: collision with root package name */
    public final w f141928d = u.f85943a;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f141929e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f141930f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f141931g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f141932h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f141933i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public boolean f141934j;

    public static Typeface e(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (linkedHashMap2.get(str) == null) {
            cw0.a aVar = (cw0.a) linkedHashMap.get(str);
            String str2 = aVar != null ? aVar.f53331f : null;
            if (str2 != null) {
                try {
                    Typeface createFromFile = Typeface.createFromFile(str2);
                    Intrinsics.checkNotNullExpressionValue(createFromFile, "createFromFile(...)");
                    linkedHashMap2.put(str, createFromFile);
                    Unit unit = Unit.f80348a;
                } catch (Exception e13) {
                    HashMap hashMap = new HashMap();
                    String message = e13.getMessage();
                    if (message != null) {
                        hashMap.put("error_message", message);
                    }
                    d0 a13 = sh.f.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                    a13.u(f1.STORY_PIN_FONT_LIST_DOWNLOAD_FAILED, str, null, hashMap, false);
                }
            }
        }
        return (Typeface) linkedHashMap2.get(str);
    }

    public final void a(yl0 font, cw0.c fontType, OkHttpClient client) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        Intrinsics.checkNotNullParameter(client, "client");
        LinkedHashSet linkedHashSet = this.f141929e;
        if (linkedHashSet.contains(font.i())) {
            return;
        }
        String i13 = font.i();
        Intrinsics.checkNotNullExpressionValue(i13, "getUid(...)");
        linkedHashSet.add(i13);
        Context context = this.f141925a;
        if (context != null) {
            new a(context, client, font, fontType).b();
        } else {
            Intrinsics.r("context");
            throw null;
        }
    }

    public final void b(boolean z13) {
        if (this.f141934j) {
            return;
        }
        int i13 = 1;
        this.f141934j = true;
        h22.f fVar = this.f141926b;
        if (fVar == null) {
            Intrinsics.r("storyPinService");
            throw null;
        }
        hj0.a aVar = new hj0.a(fVar);
        int i14 = 0;
        b0 b0Var = (b0) aVar.prepare(new Object[0]).buildRequest();
        if (!z13) {
            b0Var = b0Var.r(tk2.e.f118017c).l(wj2.c.a());
        }
        b0Var.o(new v(11, new c(this, i14)), new v(12, new c(this, i13)));
    }

    public final Typeface c(String fontId) {
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        return e(fontId, this.f141931g, this.f141930f);
    }

    public final Typeface d(f style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return e(String.valueOf(style.getId()), this.f141932h, this.f141933i);
    }

    public final void f(cw0.a font) {
        ee0.b bVar = this.f141927c;
        if (bVar == null) {
            Intrinsics.r("ideaPinFontDataProvider");
            throw null;
        }
        Intrinsics.checkNotNullParameter(font, "font");
        t r13 = new k(new g0(10, bVar, font), 1).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        r13.l(wj2.c.a()).o(new v(13, d.f141922m), new v(14, d.f141923n));
    }
}
