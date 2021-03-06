/*
 * ToolTipLabel.java - a label that has his tooltip on the top 
 * :tabSize=4:indentSize=4:noTabs=false:
 * :folding=explicit:collapseFolds=1:
 *
 * Copyright (C) 2001, 2004 Slava Pestov
 * Portions copyright (C) 2001 Mike Dillon
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.gjt.sp.jedit.gui.statusbar;

//{{{ Imports
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
//}}}

/**
 * @author Slava Pestov
 */
public class ToolTipLabel extends JLabel
{
	//{{{ ToolTipLabel() constructor
	public ToolTipLabel()
	{
		setBorder(new EmptyBorder(0, 10, 0, 10));
		addMouseListener(new HighlightMouseAdapter(this));
		setHorizontalAlignment(CENTER);
	} //}}}

	//{{{ getToolTipLocation() method
	@Override
	public Point getToolTipLocation(MouseEvent event)
	{
		return new Point(event.getX(),-20);
	} //}}}
}
