package f72;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final r0 f61358i = new r0(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t0[] values = t0.values();
        String[] names = {"none", "timeLapse", "Fairydust", "Sparkler", "Fireworks", "Lightframe", "parallax", "Analog_Grit", "Bitcrush_2", "Butterflies", "Citylights", "Euphoria_Glitch", "Glitter_shower", "Heavy_Rain", "Lightleak_color", "Lightleak_mono", "Snowglobe", "Speed", "Spotlights", "VHS"};
        Annotation[][] entryAnnotations = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        Intrinsics.checkNotNullParameter("com.pinterest.shuffles.data.entity.shuffle.ShuffleOverlayEffect", "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        qo2.v vVar = new qo2.v("com.pinterest.shuffles.data.entity.shuffle.ShuffleOverlayEffect", values.length);
        int length = values.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            t0 t0Var = values[i13];
            int i15 = i14 + 1;
            String str = (String) kotlin.collections.c0.J(i14, names);
            if (str == null) {
                str = t0Var.name();
            }
            vVar.k(str, false);
            Annotation[] annotationArr = (Annotation[]) kotlin.collections.c0.J(i14, entryAnnotations);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                    int i16 = vVar.f104659d;
                    List[] listArr = vVar.f104661f;
                    List list = listArr[i16];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[vVar.f104659d] = list;
                    }
                    list.add(annotation);
                }
            }
            i13++;
            i14 = i15;
        }
        return new qo2.w(values, vVar);
    }
}
