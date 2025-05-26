package id2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b {
    public static c a(int i13) {
        return new c(((i13 >> 16) & 255) / 255.0f, ((i13 >> 8) & 255) / 255.0f, (i13 & 255) / 255.0f, ((i13 >> 24) & 255) / 255.0f);
    }

    @NotNull
    public final no2.b serializer() {
        return a.f72188a;
    }
}
