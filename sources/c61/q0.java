package c61;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f26635a;

    public q0(ArrayList stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.f26635a = stories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f26635a, ((q0) obj).f26635a);
    }

    public final int hashCode() {
        return this.f26635a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("DynamicStoriesImagePrefetch(stories="), this.f26635a, ")");
    }
}
