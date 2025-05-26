package m1;

/* loaded from: classes.dex */
public final class t implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f85577a;

    public t(u uVar) {
        this.f85577a = uVar;
    }

    @Override // m1.m1
    public final float a(float f13) {
        if (Float.isNaN(f13)) {
            return 0.0f;
        }
        u uVar = this.f85577a;
        float floatValue = ((Number) uVar.f85593a.invoke(Float.valueOf(f13))).floatValue();
        uVar.f85597e.setValue(Boolean.valueOf(floatValue > 0.0f));
        uVar.f85598f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
