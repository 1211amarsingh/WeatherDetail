package com.kv.userweatherapp.presentation.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/kv/userweatherapp/presentation/user/UserAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/kv/userweatherapp/datalayer/db/user/UserEntity;", "Lcom/kv/userweatherapp/presentation/user/UserAdapter$ItemViewholder;", "click1", "Landroid/view/View$OnClickListener;", "(Landroid/view/View$OnClickListener;)V", "getClick1", "()Landroid/view/View$OnClickListener;", "setClick1", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewholder", "app_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.ListAdapter<com.kv.userweatherapp.datalayer.db.user.UserEntity, com.kv.userweatherapp.presentation.user.UserAdapter.ItemViewholder> {
    @org.jetbrains.annotations.NotNull()
    private android.view.View.OnClickListener click1;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener click1) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getClick1() {
        return null;
    }
    
    public final void setClick1(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kv.userweatherapp.presentation.user.UserAdapter.ItemViewholder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.presentation.user.UserAdapter.ItemViewholder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/kv/userweatherapp/presentation/user/UserAdapter$ItemViewholder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kv/userweatherapp/databinding/ItemUserBinding;", "(Lcom/kv/userweatherapp/presentation/user/UserAdapter;Lcom/kv/userweatherapp/databinding/ItemUserBinding;)V", "getBinding", "()Lcom/kv/userweatherapp/databinding/ItemUserBinding;", "setBinding", "(Lcom/kv/userweatherapp/databinding/ItemUserBinding;)V", "bind", "", "item", "Lcom/kv/userweatherapp/datalayer/db/user/UserEntity;", "app_debug"})
    public final class ItemViewholder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.kv.userweatherapp.databinding.ItemUserBinding binding;
        
        public ItemViewholder(@org.jetbrains.annotations.NotNull()
        com.kv.userweatherapp.databinding.ItemUserBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kv.userweatherapp.databinding.ItemUserBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.kv.userweatherapp.databinding.ItemUserBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.kv.userweatherapp.datalayer.db.user.UserEntity item) {
        }
    }
}