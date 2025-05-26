package c5;

import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public abstract class t {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i13) {
        return builder.setContentType(i13);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i13) {
        return builder.setUsage(i13);
    }
}
