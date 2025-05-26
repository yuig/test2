package kotlin.collections;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class a0 implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f80353b;

    public /* synthetic */ a0(Object obj, int i13) {
        this.f80352a = i13;
        this.f80353b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i13 = this.f80352a;
        Object obj = this.f80353b;
        switch (i13) {
            case 0:
                return com.bumptech.glide.c.D0((Object[]) obj);
            default:
                return ((Sequence) obj).iterator();
        }
    }
}
