package q5;

import android.view.ViewGroup;
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class y0 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102540a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f102541b;

    public /* synthetic */ y0(Object obj, int i13) {
        this.f102540a = i13;
        this.f102541b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i13 = this.f102540a;
        Object obj = this.f102541b;
        switch (i13) {
            case 0:
                return new d0(d7.b.O((ViewGroup) obj).iterator());
            case 1:
                return new il2.n(this);
            default:
                return yn2.q.a((Function2) obj);
        }
    }

    public y0(BufferedReader reader) {
        this.f102540a = 1;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f102541b = reader;
    }
}
