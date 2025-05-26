package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
