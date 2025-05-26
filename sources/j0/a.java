package j0;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.impl.h;
import c0.w0;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q8.m0;
import r0.t0;
import r0.v0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f73960a;

    /* renamed from: b */
    public final /* synthetic */ Object f73961b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f73960a = i13;
        this.f73961b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = 0;
        int i14 = this.f73960a;
        Object obj3 = this.f73961b;
        switch (i14) {
            case 0:
                h hVar = (h) obj2;
                ((m0) obj3).getClass();
                Class cls = ((h) obj).f16844a.f17014j;
                int i15 = cls == MediaCodec.class ? 2 : cls == w0.class ? 0 : 1;
                Class cls2 = hVar.f16844a.f17014j;
                if (cls2 == MediaCodec.class) {
                    i13 = 2;
                } else if (cls2 != w0.class) {
                    i13 = 1;
                }
                return i15 - i13;
            case 1:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                t0 t0Var = v0.C;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
            default:
                Function1[] selectors = (Function1[]) obj3;
                Intrinsics.checkNotNullParameter(selectors, "$selectors");
                for (Function1 function1 : selectors) {
                    int b13 = al2.a.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (b13 != 0) {
                        return b13;
                    }
                }
                return 0;
        }
    }
}
