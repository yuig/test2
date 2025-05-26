package zf1;

import a.g0;
import android.content.Context;
import com.pinterest.api.model.yl0;
import h32.f1;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kk2.k;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import okhttp3.OkHttpClient;
import pg0.o0;
import so.oa;
import su1.g;

/* loaded from: classes5.dex */
public final class a extends g {

    /* renamed from: h, reason: collision with root package name */
    public final yl0 f141908h;

    /* renamed from: i, reason: collision with root package name */
    public final cw0.c f141909i;

    /* renamed from: j, reason: collision with root package name */
    public final String f141910j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f141911k;

    /* renamed from: l, reason: collision with root package name */
    public final File f141912l;

    /* renamed from: m, reason: collision with root package name */
    public final String f141913m;

    /* renamed from: n, reason: collision with root package name */
    public final String f141914n;

    /* renamed from: o, reason: collision with root package name */
    public final String f141915o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, OkHttpClient clientWithoutRedirects, yl0 storyPinFont, cw0.c fontType) {
        super(clientWithoutRedirects);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientWithoutRedirects, "clientWithoutRedirects");
        Intrinsics.checkNotNullParameter(storyPinFont, "storyPinFont");
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        this.f141908h = storyPinFont;
        this.f141909i = fontType;
        this.f141910j = "StoryPinCustomFontDownloaderTask";
        this.f141911k = true;
        File dir = context.getDir("story_pin_fonts", 0);
        Intrinsics.checkNotNullExpressionValue(dir, "getDir(...)");
        this.f141912l = dir;
        String f13 = storyPinFont.f();
        Intrinsics.checkNotNullExpressionValue(f13, "getKey(...)");
        this.f141913m = f13;
        String j13 = storyPinFont.j();
        Intrinsics.checkNotNullExpressionValue(j13, "getUrl(...)");
        this.f141914n = j13;
        this.f141915o = "";
    }

    @Override // su1.g
    public final void g(su1.f result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(result, "result");
        e eVar = (e) ((oa) ((sq1.a) sq1.c.f115039a.getValue())).f114036z8.get();
        StringBuilder D = ep.b.D(this.f141912l.getPath(), "/");
        D.append(this.f141913m);
        String sb3 = D.toString();
        yl0 yl0Var = this.f141908h;
        String fontId = yl0Var.i();
        Intrinsics.checkNotNullExpressionValue(fontId, "getUid(...)");
        String f13 = yl0Var.f();
        Intrinsics.checkNotNullExpressionValue(f13, "getKey(...)");
        Double g13 = yl0Var.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getLineHeight(...)");
        double doubleValue = g13.doubleValue();
        String h10 = yl0Var.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getName(...)");
        cw0.c cVar = this.f141909i;
        cw0.a font = new cw0.a(fontId, f13, cVar, doubleValue, h10, sb3);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(font, "font");
        su1.f fVar = su1.f.SUCCESS;
        LinkedHashMap linkedHashMap = eVar.f141931g;
        if (result == fVar) {
            int i13 = b.f141916a[cVar.ordinal()];
            if (i13 == 1) {
                eVar.f(font);
                linkedHashMap.put(fontId, font);
            } else if (i13 == 2) {
                eVar.f(font);
                linkedHashMap.put(fontId, font);
                eVar.f141928d.d(new o0(fontId));
            } else if (i13 == 3) {
                eVar.f141932h.put(fontId, font);
            }
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("is_create", cVar == cw0.c.Creation ? "True" : "False");
            hashMap.put("error_message", result.toString());
            d0 a13 = sh.f.a();
            Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
            a13.u(f1.STORY_PIN_FONT_DOWNLOAD_FAILED, fontId, null, hashMap, false);
            ee0.b bVar = eVar.f141927c;
            if (bVar == null) {
                Intrinsics.r("ideaPinFontDataProvider");
                throw null;
            }
            Intrinsics.checkNotNullParameter(fontId, "fontId");
            Intrinsics.checkNotNullExpressionValue(new k(new g0(8, bVar, fontId), 1).r(tk2.e.f118017c), "subscribeOn(...)");
            linkedHashMap.remove(fontId);
        }
        eVar.f141929e.remove(fontId);
    }
}
