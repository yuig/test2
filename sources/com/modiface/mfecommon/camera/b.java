package com.modiface.mfecommon.camera;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes7.dex */
public enum b {
    ROTATE0_NOFLIP(0, false, 0),
    ROTATE0_FLIP(1, false, 0),
    ROTATE90_NOFLIP(2, true, 90),
    ROTATE90_FLIP(3, true, 90),
    ROTATE180_NOFLIP(4, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP),
    ROTATE180_FLIP(5, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP),
    ROTATE270_NOFLIP(6, true, RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF),
    ROTATE270_FLIP(7, true, RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF);


    /* renamed from: a, reason: collision with root package name */
    private final int f34190a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34191b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34192c;

    b(int i13, boolean z13, int i14) {
        this.f34190a = i13;
        this.f34191b = z13;
        this.f34192c = i14;
    }

    public int b() {
        return this.f34190a;
    }

    public int c() {
        return this.f34192c;
    }

    public boolean d() {
        return this.f34191b;
    }
}
