package c4;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25631a = new b();

    /* JADX WARN: Type inference failed for: r0v2, types: [c4.a] */
    public final int[] a(@NotNull z zVar, @NotNull RectF rectF, int i13, @NotNull final Function2<? super RectF, ? super RectF, Boolean> function2) {
        SegmentFinder l13;
        int[] rangeForRect;
        if (i13 == 1) {
            l13 = d4.b.f53668a.a(new d4.h(zVar.f25690f.getText(), zVar.j()));
        } else {
            androidx.media3.ui.a0.p();
            l13 = androidx.media3.ui.a0.l(androidx.media3.ui.a0.k(zVar.f25690f.getText(), zVar.f25685a));
        }
        rangeForRect = zVar.f25690f.getRangeForRect(rectF, l13, new Layout.TextInclusionStrategy() { // from class: c4.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) Function2.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
