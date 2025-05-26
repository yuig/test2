package androidx.media;

import android.util.SparseIntArray;
import wa.c;

/* loaded from: classes3.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18726b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f18727a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f18727a;
        return audioAttributesImpl == null ? audioAttributesCompat.f18727a == null : audioAttributesImpl.equals(audioAttributesCompat.f18727a);
    }

    public final int hashCode() {
        return this.f18727a.hashCode();
    }

    public final String toString() {
        return this.f18727a.toString();
    }
}
