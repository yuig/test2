package z9;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final z f141315a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f141316b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f141317c;

    /* renamed from: d, reason: collision with root package name */
    public final int f141318d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f141319e;

    /* renamed from: f, reason: collision with root package name */
    public final int f141320f;

    public y(z destination, Bundle bundle, boolean z13, int i13, boolean z14, int i14) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f141315a = destination;
        this.f141316b = bundle;
        this.f141317c = z13;
        this.f141318d = i13;
        this.f141319e = z14;
        this.f141320f = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(y other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z13 = this.f141317c;
        if (z13 && !other.f141317c) {
            return 1;
        }
        if (!z13 && other.f141317c) {
            return -1;
        }
        int i13 = this.f141318d - other.f141318d;
        if (i13 > 0) {
            return 1;
        }
        if (i13 < 0) {
            return -1;
        }
        Bundle bundle = other.f141316b;
        Bundle bundle2 = this.f141316b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            Intrinsics.f(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z14 = other.f141319e;
        boolean z15 = this.f141319e;
        if (z15 && !z14) {
            return 1;
        }
        if (z15 || !z14) {
            return this.f141320f - other.f141320f;
        }
        return -1;
    }
}
