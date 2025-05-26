package x;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final InputConfiguration f131246a;

    public e(InputConfiguration inputConfiguration) {
        this.f131246a = inputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Objects.equals(this.f131246a, ((e) obj).f131246a);
    }

    public final int hashCode() {
        return this.f131246a.hashCode();
    }

    public final String toString() {
        return this.f131246a.toString();
    }
}
