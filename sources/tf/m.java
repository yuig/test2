package tf;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;

/* loaded from: classes3.dex */
public final class m extends e {
    public float A;
    public float B;
    public boolean C;

    /* renamed from: t, reason: collision with root package name */
    public float f117539t;

    /* renamed from: u, reason: collision with root package name */
    public float f117540u;

    /* renamed from: v, reason: collision with root package name */
    public l f117541v;

    /* renamed from: w, reason: collision with root package name */
    public l f117542w;

    /* renamed from: x, reason: collision with root package name */
    public int f117543x;

    /* renamed from: y, reason: collision with root package name */
    public float f117544y;

    /* renamed from: z, reason: collision with root package name */
    public float f117545z;

    @Override // tf.e
    public final void a(Entry entry) {
        PieEntry pieEntry = (PieEntry) entry;
        if (pieEntry == null) {
            return;
        }
        b(pieEntry);
    }
}
