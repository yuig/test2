package com.google.android.material.search;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.pinterest.design.brio.widget.PinterestEditText;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataEditText;
import com.pinterest.feature.pin.edit.view.AttributeBasicsListView;
import com.pinterest.feature.search.results.view.SearchBarView;
import java.util.ArrayList;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pk.a0;
import rh1.v1;
import up0.l;

/* loaded from: classes3.dex */
public final class e implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32993b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f32992a = i13;
        this.f32993b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s13) {
        switch (this.f32992a) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                ((SearchBarView) this.f32993b).getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(s13, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence text, int i13, int i14, int i15) {
        switch (this.f32992a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "text");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence text, int i13, int i14, int i15) {
        int i16 = this.f32992a;
        Character ch3 = null;
        boolean z13 = false;
        Object obj = this.f32993b;
        switch (i16) {
            case 0:
                ((SearchView) obj).f32969k.setVisibility(text.length() > 0 ? 0 : 8);
                break;
            case 1:
                if (text.length() <= 0) {
                    PinterestEditText pinterestEditText = (PinterestEditText) obj;
                    pinterestEditText.setCompoundDrawablesRelative(null, null, null, null);
                    pinterestEditText.f44838j = false;
                    break;
                } else {
                    PinterestEditText pinterestEditText2 = (PinterestEditText) obj;
                    pinterestEditText2.setCompoundDrawablesRelative(null, null, pinterestEditText2.f44840l, null);
                    pinterestEditText2.f44838j = true;
                    break;
                }
            case 2:
                AttributeBasicsListView attributeBasicsListView = (AttributeBasicsListView) obj;
                Editable text2 = attributeBasicsListView.f47173f.getText();
                if (text2 != null) {
                    attributeBasicsListView.j();
                    ArrayList e13 = l.e(text2);
                    y11.f fVar = attributeBasicsListView.f47183p;
                    if (fVar != null) {
                        fVar.m2(StringsKt.i0(text2.toString()).toString(), e13);
                    }
                }
                MetadataEditText metadataEditText = attributeBasicsListView.f47173f;
                Editable text3 = metadataEditText.getText();
                metadataEditText.setHint((text3 == null || text3.length() == 0) ? attributeBasicsListView.f47182o : "");
                if (text != null) {
                    attributeBasicsListView.f47172e.setVisibility(text.length() >= attributeBasicsListView.f47181n ? 0 : 8);
                }
                if (text != null) {
                    Intrinsics.checkNotNullParameter(text, "<this>");
                    if (i13 >= 0 && i13 <= StringsKt.I(text)) {
                        ch3 = Character.valueOf(text.charAt(i13));
                    }
                }
                if (ch3 != null) {
                    com.pinterest.ui.text.e.f52661b.matcher(String.valueOf(ch3.charValue())).matches();
                    break;
                }
                break;
            case 3:
                SearchBarView searchBarView = (SearchBarView) obj;
                searchBarView.getClass();
                boolean x03 = a0.x0(text);
                k3.R1(searchBarView.f47687d, !x03);
                ImageView imageView = searchBarView.f47688e;
                if (x03 && searchBarView.f47692i) {
                    z13 = true;
                }
                k3.R1(imageView, z13);
                String charSequence = text.toString();
                String trim = charSequence != null ? charSequence.trim() : "";
                if (searchBarView.f47690g != null && a0.x0(searchBarView.f47691h) && a0.D0(trim)) {
                    searchBarView.f47690g.P0();
                }
                if (a0.x0(trim) || !trim.equals(searchBarView.f47691h)) {
                    searchBarView.f47691h = trim;
                    com.pinterest.feature.search.results.view.j jVar = searchBarView.f47690g;
                    if (jVar != null) {
                        jVar.Y(trim);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "text");
                int i17 = v1.S0;
                ((v1) obj).j8();
                break;
        }
    }
}
