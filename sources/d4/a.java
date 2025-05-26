package d4;

import android.text.SegmentFinder;

/* loaded from: classes3.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f53667a;

    public a(f fVar) {
        this.f53667a = fVar;
    }

    public final int nextEndBoundary(int i13) {
        return this.f53667a.c(i13);
    }

    public final int nextStartBoundary(int i13) {
        return this.f53667a.a(i13);
    }

    public final int previousEndBoundary(int i13) {
        return this.f53667a.e(i13);
    }

    public final int previousStartBoundary(int i13) {
        return this.f53667a.b(i13);
    }
}
