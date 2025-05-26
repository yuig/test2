package q5;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class w0 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102529b;

    public /* synthetic */ w0(Object obj, int i13) {
        this.f102528a = i13;
        this.f102529b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i13 = this.f102528a;
        Object obj = this.f102529b;
        switch (i13) {
            case 0:
                return new x0((ViewGroup) obj, 0);
            case 1:
                return com.bumptech.glide.c.D0((Object[]) obj);
            case 2:
                return ((Iterable) obj).iterator();
            default:
                return (Iterator) obj;
        }
    }
}
