package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import jp2.u;
import org.chromium.build.annotations.UsedByReflection;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes2.dex */
public class NativeCronetProvider extends CronetProvider {
    @UsedByReflection
    public NativeCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder(new u(this.mContext));
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext));
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return "119.0.6045.31";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
