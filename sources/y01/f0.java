package y01;

/* loaded from: classes5.dex */
public final class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136400a;

    public f0(boolean z13) {
        this.f136400a = z13;
    }

    public final boolean a() {
        return this.f136400a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f136400a == ((f0) obj).f136400a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136400a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("StartScreenshotEducationExperience(isAndroidPinCloseupAfterScreenshotExperienceEnabled="), this.f136400a, ")");
    }
}
