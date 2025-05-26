package com.linecorp.linesdk;

import android.content.Context;
import android.os.Bundle;
import com.linecorp.linesdk.api.LineEnvConfig;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.q;
import xk2.r;
import xk2.s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/linecorp/linesdk/ManifestParser;", "", "Landroid/content/Context;", "context", "Lcom/linecorp/linesdk/api/LineEnvConfig;", "parse", "(Landroid/content/Context;)Lcom/linecorp/linesdk/api/LineEnvConfig;", "<init>", "()V", "line-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ManifestParser {
    public static LineEnvConfig a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                Intrinsics.e(newInstance, "clazz.newInstance()");
                if (newInstance instanceof LineEnvConfig) {
                    return (LineEnvConfig) newInstance;
                }
                throw new RuntimeException(a.a.i("Expected instanceof LineEnvConfig, but found: ", newInstance));
            } catch (ReflectiveOperationException e13) {
                throw new RuntimeException(a.a.h("Unable to instantiate LineEnvConfig implementation for ", cls), e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find LineEnvConfig implementation", e14);
        }
    }

    public final LineEnvConfig parse(@NotNull Context context) {
        Object m13;
        String string;
        Intrinsics.h(context, "context");
        try {
            q qVar = s.f135225b;
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).metaData;
            m13 = (bundle == null || (string = bundle.getString("LineEnvConfig")) == null) ? null : a(string);
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        return (LineEnvConfig) (m13 instanceof r ? null : m13);
    }
}
