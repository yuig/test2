package an2;

import am2.c1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f15764a = new c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [am2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [am2.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [am2.m] */
    @Override // an2.e
    public final String a(am2.j classifier, y renderer) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        if (classifier instanceof c1) {
            ym2.g name = ((c1) classifier).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return renderer.T(name, false);
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(classifier.getName());
            classifier = classifier.g();
        } while (classifier instanceof am2.g);
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return kotlin.jvm.internal.j.D(new kotlin.collections.c1(arrayList));
    }
}
