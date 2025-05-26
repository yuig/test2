package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.activity.sendapin.ui.PeoplePickerPersonCell;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import wy1.d;
import xc0.e;

/* loaded from: classes3.dex */
public class PersonRightImageListCell extends PeoplePickerPersonCell {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34888i = 0;

    /* renamed from: h, reason: collision with root package name */
    public GestaltButtonToggle f34889h;

    public PersonRightImageListCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.pinterest.activity.sendapin.ui.PersonListCell, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f34889h = (GestaltButtonToggle) findViewById(d.inline_add_button);
        View findViewById = findViewById(e.divider);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
