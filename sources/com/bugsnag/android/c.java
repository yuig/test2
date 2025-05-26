package com.bugsnag.android;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29172a;

    public /* synthetic */ c(int i13) {
        this.f29172a = i13;
    }

    @Override // com.bugsnag.android.f2
    public final boolean a(x0 x0Var) {
        boolean m87performOneTimeSetup$lambda1;
        boolean m88performOneTimeSetup$lambda0;
        switch (this.f29172a) {
            case 0:
                m87performOneTimeSetup$lambda1 = AnrPlugin.m87performOneTimeSetup$lambda1(x0Var);
                return m87performOneTimeSetup$lambda1;
            default:
                m88performOneTimeSetup$lambda0 = NdkPlugin.m88performOneTimeSetup$lambda0(x0Var);
                return m88performOneTimeSetup$lambda0;
        }
    }
}
