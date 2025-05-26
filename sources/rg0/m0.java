package rg0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class m0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f108055c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108056d;

    /* renamed from: e, reason: collision with root package name */
    public final List f108057e;

    /* renamed from: f, reason: collision with root package name */
    public final String f108058f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(vd0.c cVar) {
        super(null, null);
        vd0.c m13 = cVar.m("complete_button");
        String completeButton = m13 != null ? m13.o("text", "") : null;
        completeButton = completeButton == null ? "" : completeButton;
        vd0.c m14 = cVar.m("dismiss_button");
        String dismissButton = m14 != null ? m14.o("text", "") : null;
        dismissButton = dismissButton == null ? "" : dismissButton;
        vd0.a k13 = cVar.k("pins_thumbnails_preview");
        IntRange q13 = ql2.s.q(0, k13.d());
        ArrayList thumbnails = new ArrayList();
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            String l13 = k13.l(it.b());
            if (l13 != null) {
                thumbnails.add(l13);
            }
        }
        String d2 = cVar.d("board_preview_id");
        Intrinsics.checkNotNullParameter(completeButton, "completeButton");
        Intrinsics.checkNotNullParameter(dismissButton, "dismissButton");
        Intrinsics.checkNotNullParameter(thumbnails, "thumbnails");
        this.f108055c = completeButton;
        this.f108056d = dismissButton;
        this.f108057e = thumbnails;
        this.f108058f = d2;
        String o13 = cVar.o("title", "");
        this.f15163a = o13 == null ? "" : o13;
        String o14 = cVar.o("message", "");
        this.f15164b = o14 != null ? o14 : "";
    }
}
