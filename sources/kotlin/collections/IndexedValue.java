package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f80349a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f80350b;

    public IndexedValue(int i13, Object obj) {
        this.f80349a = i13;
        this.f80350b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f80349a == indexedValue.f80349a && Intrinsics.d(this.f80350b, indexedValue.f80350b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f80349a) * 31;
        Object obj = this.f80350b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f80349a + ", value=" + this.f80350b + ')';
    }
}
