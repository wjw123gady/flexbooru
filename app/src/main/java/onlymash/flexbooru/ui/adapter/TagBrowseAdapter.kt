/*
 * Copyright (C) 2019 by onlymash <im@fiepi.me>, All rights reserved
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package onlymash.flexbooru.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import onlymash.flexbooru.entity.TagFilter
import onlymash.flexbooru.ui.viewholder.TagBrowseViewHolder

class TagBrowseAdapter(private val tags: MutableList<TagFilter>,
                       private val itemListener: TagBrowseViewHolder.ItemListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        TagBrowseViewHolder.create(parent)

    override fun getItemCount(): Int = tags.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TagBrowseViewHolder).apply {
            bind(tags[position])
            setItemListener(itemListener)
        }
    }
}