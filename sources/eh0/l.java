package eh0;

import i32.v;
import i32.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final kg.n f58934c;

    /* renamed from: d, reason: collision with root package name */
    public final a f58935d;

    /* renamed from: e, reason: collision with root package name */
    public final a f58936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String title, String detailedText, kg.n media, a completeButton, a aVar) {
        super(title, detailedText);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detailedText, "detailedText");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(completeButton, "completeButton");
        this.f58934c = media;
        this.f58935d = completeButton;
        this.f58936e = aVar;
    }

    public static final l c(vd0.c json) {
        String d2;
        kg.n cVar;
        String d13;
        vd0.c m13;
        String d14;
        vd0.c m14;
        Intrinsics.checkNotNullParameter(json, "json");
        String d15 = json.d("title");
        a aVar = null;
        if (d15 == null || (d2 = json.d("body")) == null) {
            return null;
        }
        v vVar = x.Companion;
        int j13 = json.j(0, "media_type");
        vVar.getClass();
        x xVar = j13 != 1 ? j13 != 2 ? null : x.VIDEO : x.IMAGE;
        int i13 = xVar == null ? -1 : k.f58933a[xVar.ordinal()];
        if (i13 == 1) {
            vd0.c m15 = json.m("image");
            if (m15 == null || (d13 = m15.d("url")) == null) {
                return null;
            }
            cVar = new c(d13, m15.d("image_alt"));
        } else {
            if (i13 != 2 || (m13 = json.m("video")) == null || (d14 = m13.d("url")) == null || (m14 = m13.m("metadata")) == null) {
                return null;
            }
            String d16 = m14.d("thumbnail");
            if (d16 == null) {
                d16 = "";
            }
            cVar = new e(d14, new d(d16, m14.j(1, "width"), m14.j(1, "height")));
        }
        vd0.c json2 = json.m("complete_button");
        if (json2 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(json2, "json");
        String d17 = json2.d("text");
        a aVar2 = d17 == null ? null : new a(d17, json2.d("url"));
        if (aVar2 == null) {
            return null;
        }
        vd0.c json3 = json.m("dismiss_button");
        if (json3 != null) {
            Intrinsics.checkNotNullParameter(json3, "json");
            String d18 = json3.d("text");
            if (d18 != null) {
                aVar = new a(d18, json3.d("url"));
            }
        }
        return new l(d15, d2, cVar, aVar2, aVar);
    }
}
