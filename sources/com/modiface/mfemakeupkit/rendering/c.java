package com.modiface.mfemakeupkit.rendering;

import android.content.res.AssetManager;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfemakeupkit.MFEMakeupEngine;

/* loaded from: classes7.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f34569a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.Region f34570b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AssetManager f34571c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f34572d;

    public c(a aVar, String str, MFEMakeupEngine.Region region, AssetManager assetManager) {
        this.f34572d = aVar;
        this.f34569a = str;
        this.f34570b = region;
        this.f34571c = assetManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.c cVar;
        MFEDebugInfo mFEDebugInfo;
        com.modiface.mfecommon.utils.n nVar;
        cVar = this.f34572d.f34558e;
        String str = this.f34569a;
        MFEMakeupEngine.Region region = this.f34570b;
        AssetManager assetManager = this.f34571c;
        mFEDebugInfo = this.f34572d.f34567n;
        cVar.h(str, region, assetManager, mFEDebugInfo);
        nVar = this.f34572d.f34557d;
        nVar.d(new b(this));
    }
}
